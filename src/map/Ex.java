package map;

import java.util.HashMap;
import java.util.Map;

public class Ex {

	public void ex1() {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("An", 85);
		scores.put("Bình", 92);
		scores.put("Chi", 78);
		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println("Học sinh: " + name + ", Điểm: " + score);
		}
	}
	
	public void ex2() {
		Map<String, Integer> students = new HashMap<>();
		students.put("An", 85);
		students.put("Bình", 90);
		students.put("Chi", 78);
		students.put("Dũng", 88);
		students.put("Hà", 92);
		System.out.println("Danh sách học sinh:");
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + " điểm");
		}
		System.out.println("\nĐiểm của Chi là: " + students.get("Chi"));
		System.out.println("Lan có trong danh sách? " + students.containsKey("Lan"));
		students.remove("Dũng");
		System.out.println("\nĐã xóa Dũng. Danh sách còn lại:");
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("\nTổng số học sinh: " + students.size());
		students.clear();
		System.out.println("Sau khi clear, danh sách rỗng? " + students.isEmpty());
	}

	public void ex3() {
		Map<String, Integer> students = new HashMap<>();
		students.put("An", 85);
		students.put("Bình", 90);
		students.put("Chi", 78);
		students.put("Dũng", 88);
		students.put("Hà", 92);
		// Khởi tạo giá trị ban đầu
		String maxName = "";
		String minName = "";
		int maxScore = Integer.MIN_VALUE;
		int minScore = Integer.MAX_VALUE;
		// Duyệt qua từng entry để tìm max/min
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			String name = entry.getKey();
			int score = entry.getValue();
			if (score > maxScore) {
				maxScore = score;
				maxName = name;
			}
			if (score < minScore) {
				minScore = score;
				minName = name;
			}
		}
		// In kết quả
		System.out.println("🔝 Học sinh có điểm cao nhất: " + maxName + " - " + maxScore + " điểm");
		System.out.println("🔻 Học sinh có điểm thấp nhất: " + minName + " - " + minScore + " điểm");
	}
	public static void main(String[] args) {
		Ex ex = new Ex();
		ex.ex3();
	}
}
