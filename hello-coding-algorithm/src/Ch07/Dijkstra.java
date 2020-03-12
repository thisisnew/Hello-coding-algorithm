package Ch07;

public class Dijkstra {
	public static void main(String[] args) {
		Dijkstra d = new Dijkstra(8);
		
		d.input(1, 2, 3);
        d.input(1, 5, 4);
        d.input(1, 4, 4);
        d.input(2, 3, 2);
        d.input(3, 4, 1);
        d.input(4, 5, 2);
        d.input(5, 6, 4);
        d.input(4, 7, 6);
        d.input(7, 6, 3);
        d.input(3, 8, 3);
        d.input(6, 8, 2);
        d.dijkstra(1);

	}

	private int n;
	private int maps[][];

	public Dijkstra(int n){
	        this.n = n;
	        maps = new int[n+1][n+1];
	         
	    }

	public void input(int i, int j, int w) {
		maps[i][j] = w;
		maps[j][i] = w;
	}

	public void dijkstra(int v) {
		int distance[] = new int[n + 1];
		boolean[] check = new boolean[n + 1];

		for (int i = 1; i < n + 1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		distance[v] = 0;
		check[v] = true;

		for (int i = 1; i < n + 1; i++) {
			if (!check[i] && maps[v][i] != 0) {
				distance[i] = maps[v][i];
			}
		}

		for (int a = 0; a < n - 1; a++) {
			int min = Integer.MAX_VALUE;
			int min_index = -1;

			for (int i = 1; i < n + 1; i++) {
				if (!check[i] && distance[i] != Integer.MAX_VALUE) {
					if (distance[i] < min) {
						min = distance[i];
						min_index = i;
					}
				}
			}

			check[min_index] = true;
			for (int i = 1; i < n + 1; i++) {
				if (!check[i] && maps[min_index][i] != 0) {
					if (distance[i] > distance[min_index] + maps[min_index][i]) {
						distance[i] = distance[min_index] + maps[min_index][i];
					}
				}
			}

		}

		for (int i = 1; i < n + 1; i++) {
			System.out.print(distance[i] + " ");
		}
		System.out.println("");
	}
}
