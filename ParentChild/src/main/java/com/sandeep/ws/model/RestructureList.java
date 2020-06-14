package com.sandeep.ws.model;
import java.util.ArrayList;
import java.util.List;

public class RestructureList {

	public static List<Data> createlist() {

		// TODO Auto-generated method stub
		List<Data> recordList = new ArrayList<Data>();
		Data record1 = new Data(1, 0, "warrior", "Red");
		Data record2 = new Data(2, 0, "Wizard", "green");
		Data record3 = new Data(3, 0, "Priest", "white");
		Data record4 = new Data(4, 0, "Rogue", "yellow");
		Data record5 = new Data(5, 1, "Fighter", "blue");
		Data record6 = new Data(6, 1, "Paladin", "lighblue");
		Data record7 = new Data(7, 1, "Ranger", "lighgreen");
		Data record8 = new Data(8, 2, "Mage", "grey");
		Data record9 = new Data(9, 2, "Specialist wizard", "lightgrey");
		Data record10 = new Data(10, 3, "Cleric", "red");
		Data record11 = new Data(11, 3, "Druid", "green");
		Data record12 = new Data(12, 3, "Priest of specific mythos", "white");
		Data record13 = new Data(13, 4, "Thief", "white");
		Data record14 = new Data(14, 4, "Bard", "blue");
		Data record15 = new Data(15, 13, "Assassin", "lighblue");

		recordList.add(0, record1);
		recordList.add(1, record2);
		recordList.add(2, record3);
		recordList.add(3, record4);
		recordList.add(4, record5);
		recordList.add(5, record6);
		recordList.add(6, record7);
		recordList.add(7, record8);
		recordList.add(8, record9);
		recordList.add(9, record10);
		recordList.add(10, record11);
		recordList.add(11, record12);
		recordList.add(12, record13);
		recordList.add(13, record14);
		recordList.add(14, record15);
		return recordList;

	}

}
