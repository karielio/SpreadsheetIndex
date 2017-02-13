
public class SpreadsheetIndex {

	public static void main(String[] args) {
		System.out.println("1 corresponds to: " + columnName(1, ""));
		System.out.println("5 corresponds to: " + columnName(5, ""));
		System.out.println("26 corresponds to: " + columnName(26, ""));
		System.out.println("27 corresponds to: " + columnName(27, ""));
		System.out.println("676 corresponds to: " + columnName(676, ""));
		System.out.println("677 corresponds to: " + columnName(677, ""));
		System.out.println("702 corresponds to: " + columnName(702, ""));
		System.out.println("703 corresponds to: " + columnName(703, ""));
		System.out.println("755 corresponds to: " + columnName(755, ""));
		System.out.println("18800 corresponds to: " + columnName(18800, ""));
		System.out.println("18331 corresponds to: " + columnName(18331, ""));
		System.out.println("776508763 corresponds to: " + columnName(776508763, ""));
		System.out.println("0 corresponds to: " + columnName(0, ""));
		System.out.println("-1 corresponds to: " + columnName(-1, ""));
	}
	
	
	public static String columnName(int index, String output){
		if (index < 1)
			return "index must be greater than 0";
		else if (index == 26)
			return output + getChar(0);
		else if(index/26 < 1)
			return output + getChar(index%26);
		else
		{
			if (index%26 == 0)
				return columnName((index/26) - 1, "") + columnName(index%26, "");
			else
				return columnName(index/26, "") + columnName(index%26, "");
		}
	}
	
	public static String getChar(int index){
		String output = "";
		
		switch (index) {
			case 0: output = output+'Z';
					break;
			case 1: output = output+'A';
					break;
			case 2: output = output+'B';
					break;
			case 3: output = output+'C';
					break;
			case 4: output = output+'D';
					break;
			case 5: output = output+'E';
					break;
			case 6: output = output+'F';
					break;
			case 7: output = output+'G';
					break;
			case 8: output = output+'H';
					break;
			case 9: output = output+'I';
					break;
			case 10: output = output+'J';
					break;
			case 11: output = output+'K';
					break;
			case 12: output = output+'L';
					break;
			case 13: output = output+'M';
					break;
			case 14: output = output+'N';
					break;
			case 15: output = output+'O';
					break;
			case 16: output = output+'P';
					break;
			case 17: output = output+'Q';
					break;
			case 18: output = output+'R';
					break;
			case 19: output = output+'S';
					break;
			case 20: output = output+'T';
					break;
			case 21: output = output+'U';
					break;
			case 22: output = output+'V';
					break;
			case 23: output = output+'W';
					break;
			case 24: output = output+'X';
					break;
			case 25: output = output+'Y';
					break;
			}
		
			return output;
		}
		

}
