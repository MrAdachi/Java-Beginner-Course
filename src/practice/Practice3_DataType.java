package practice;

public class Practice3_DataType {
	
	public static void main(String[] args) {
		int month = 12;
		int day = 29;
		//	float型 → 末尾に"f"を付けないとerror発生！	
		float weight = 63.0f;
		double height = 168.5;
		//	char型 → ''で文字を囲む！	
		char bloodType = 'A';
		
		//	String型 → ""で文字列を囲む！
		String name = "菅原";
		
		System.out.println("こんにちは！" + name + "です。");
		System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
		System.out.println("誕生日は" + month + "月" + day + "日、");
		System.out.println("血液型は" + bloodType + "型です。");
		System.out.println("チャンネル登録や拡散よろしくお願いします！");
		
	}

}
