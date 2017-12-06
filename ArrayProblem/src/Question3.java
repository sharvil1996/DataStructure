import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int arr[];
		String temp[];
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			arr = new int[N];
			temp = new String[N];
			for (int j = 0; j < N; j++) {
				arr[j] = scanner.nextInt();
				temp[j] = Integer.toBinaryString(arr[j]);
			}

			System.out.println(new findDifference().findDiff(temp, arr, N));
		}
	}

}

class findDifference {
	public int findDiff(String temp[], int arr[], int N) {
		int sum = 0;
		for (int j = 0; j < N; j++) {
			for (int k = j + 1; k < N; k++) {
				if (temp[j].length() == temp[k].length()) {
					// System.out.println(temp[j] + " " + temp[j].length()+
					// " "+temp[k]+" " + temp[k].length());
					for (int l = 0; l < temp[j].length(); l++) {
						if (temp[j].charAt(l) != temp[k].charAt(l))
							sum++;
					}
				} else {
					if (arr[j] > arr[k]) {
						temp[k] = String.format("%1$" + temp[j].length() + "s", temp[k]).replace(' ', '0');
						for (int l = 0; l < temp[j].length(); l++) {
							if (temp[j].charAt(l) != temp[k].charAt(l))
								sum++;
						}

						// System.out.println(temp[j] + " " +
						// temp[j].length()+ " "+temp[k]+" " +
						// temp[k].length());
					} else {
						temp[j] = String.format("%1$" + temp[k].length() + "s", temp[j]).replace(' ', '0');
						for (int l = 0; l < temp[j].length(); l++) {
							if (temp[j].charAt(l) != temp[k].charAt(l))
								sum++;
						}
						// System.out.println(temp[j] + " " +
						// temp[j].length()+ " "+temp[k]+" " +
						// temp[k].length());
					}
				}

			}

		}

		return sum*2;
	}
}
