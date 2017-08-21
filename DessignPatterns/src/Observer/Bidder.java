package Observer;

public class Bidder implements Observer {
	static int ID_TRACKER = 0;
	double m_currentMaxBid;
	public double m_bid;
	public int m_id;
	EnglishAuction m_auction;
	
	public Bidder(EnglishAuction auction) {
		m_id = ++ID_TRACKER;
		m_auction = auction;
	}
	@Override
	public void update() {
		m_currentMaxBid = m_auction.getHighestBid();
		
	}
	
	public void placeBid(double bid) {
		m_bid = bid;
		System.out.println("Observer_"+m_id +" placed new bid: "+ bid);
	}

}
