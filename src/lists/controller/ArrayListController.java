package lists.controller;

import java.util.ArrayList;
import lists.view.ListViewer;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListViewer popupDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListViewer();
	}
	
	public void start()
	{
		firstWords.add("asdihfalskjdfhlaskjdfhakljsdfh");
		firstWords.add("babababbababababababababa");
		firstWords.add(1,"CRYING INSANELY");
		/**
		 *  displays the first word and then keeps moving on to the next
		 */
		displayList();
		firstWords.set(2, "mamamamamamamamamamamamamamamamama");
		displayList();
		firstWords.remove(0);
		displayList();
		showOtherLoop();
	}
	
	private void displayList()
	{
		popupDisplay.showList("The size of the list it " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot  + " are " + firstWords.get(spot));
			firstWords.remove(0);
		}
			
	}
	
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	}
}
