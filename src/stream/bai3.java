package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Viết chương trình in ra tất cả tên viết hoa.
public class bai3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Cường", "Dũng");
		List<String> result = names.stream()
							.filter(name -> name.length() >3 )
							.map(String::toLowerCase)
							.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
