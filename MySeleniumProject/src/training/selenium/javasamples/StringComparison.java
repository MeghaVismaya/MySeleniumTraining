package training.selenium.javasamples;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "3:04:33:04";
		String v2 = "3:04:33:06";
		String[] subV1 = v1.split(":");
		String[] subV2 = v2.split(":");

		for (int i = 0; i < subV1.length; i++) {
			int num1 = Integer.parseInt(subV1[i]);
			int num2 = Integer.parseInt(subV2[i]);
			if (num1 > num2) {
				System.out.println(v1 + " is latest version");
				break;
			} else if (Integer.parseInt(subV1[i]) < Integer.parseInt(subV2[i])) {
				System.out.println(v2 + " is latest version");
				break;
			}

		}
	}
}
