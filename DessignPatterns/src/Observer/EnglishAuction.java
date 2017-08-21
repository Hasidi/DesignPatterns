package Observer;

import java.util.ArrayList;

public class EnglishAuction implements Subject {
	private ArrayList<Observer> m_observers;
	int m_maxRounds;
	double m_maxBid;
	int m_currentWinner;
	int m_currentRound;
	
	public EnglishAuction(int maxRounds) {
		m_observers = new ArrayList<>();
		m_maxRounds = maxRounds;
	}
	
	@Override
	public void register(Observer o) {
		System.out.println("Observer "+m_observers.size() +" was added");
		m_observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		int index = m_observers.indexOf(o);
		System.out.println("Observer "+index+" was deleted");
		m_observers.remove(index);		
	}

	@Override
	public void notifyObservers() {
		for (Observer o : m_observers) {
			o.update();
		}		
	}
	
	public void updateMaxBid() {
		double currentMaxBid = (m_maxBid > 0) ? m_maxBid : 0;
		int maxBidder = m_currentWinner;
		for (Observer o : m_observers) {
			Bidder bidder = (Bidder)o;
			if (bidder.m_bid > currentMaxBid) {
				currentMaxBid = bidder.m_bid;
				maxBidder = bidder.m_id;
			}
		}
		m_currentWinner = maxBidder;
		m_maxBid = currentMaxBid;
		notifyObservers();
		System.out.println("Notify observers the new highest bid is " + m_maxBid);
		m_currentRound++;
		if (m_currentRound == m_maxRounds) {
			System.out.println("Auction completed. The winner is observer_"+ m_currentWinner + " with bid: " + m_maxBid);
		}
	}
	
	public double getHighestBid() {
		return m_maxBid;
	}
	
	
	
}
