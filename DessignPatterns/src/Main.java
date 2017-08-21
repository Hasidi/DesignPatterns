
import Observer.*;
import Strategy.*;


public class Main {

	public static void main(String[] args) {

//		int[] arr = new int[] {3, 1, 2, 7, 4, 0, 8 , 4};
//		Sorter sorter = new MergeSort();
//		MyArray myArr = new MyArray(arr, sorter);
//		myArr.sortArray();
//		myArr.printArray();
		
		EnglishAuction auction = new EnglishAuction(3);
		Bidder b1 = new Bidder(auction); Bidder b2 = new Bidder(auction); Bidder b3 = new Bidder(auction);
		auction.register(b1); auction.register(b2); auction.register(b3);
		b1.placeBid(20); b2.placeBid(25); b3.placeBid(15);
		auction.updateMaxBid();
		b1.placeBid(30); b2.placeBid(30); b3.placeBid(50);
		auction.updateMaxBid();
		b2.placeBid(70); b3.placeBid(65);
		auction.updateMaxBid();
		
	}

}
