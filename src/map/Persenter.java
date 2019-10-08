package map;

public class Persenter {

	private LonLat leftTopLonlat;
	private LonLat rightBottomLonLat;
	private LonLat centerLonlat;
	
	private LonLat myLeftTopLonLat;
	private LonLat myRightBottomLonLat;
	
	public boolean startDownLoad() {
		if(
			leftTopLonlat == null
			|| rightBottomLonLat == null
			|| centerLonlat == null
			|| myLeftTopLonLat == null 
			|| myRightBottomLonLat == null
		){
			return false;
		}
		return true;
	}

	public void setLeftTopLonlat(LonLat leftTopLonlat) {
		this.leftTopLonlat = leftTopLonlat;
	}

	public void setRightBottomLonLat(LonLat rightBottomLonLat) {
		this.rightBottomLonLat = rightBottomLonLat;
	}

	public void setMyLeftTopLonLat(LonLat myLeftTopLonLat) {
		this.myLeftTopLonLat = myLeftTopLonLat;
	}

	public void setMyRightBottomLonLat(LonLat myRightBottomLonLat) {
		this.myRightBottomLonLat = myRightBottomLonLat;
	}

	public void setCenterLonlat(LonLat centerLonlat) {
		this.centerLonlat = centerLonlat;
	}

}
