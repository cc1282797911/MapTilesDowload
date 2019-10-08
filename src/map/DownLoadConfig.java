package map;

public class DownLoadConfig {

	private LonLat leftTopLonlat;
	private LonLat rightBottomLonLat;
	private LonLat centerLonlat;
	
	private LonLat myLeftTopLonLat;
	private LonLat myRightBottomLonLat;
	
	private int minLevel = 1;
	private int maxLevel = 18;
	
	public LonLat getLeftTopLonlat() {
		return leftTopLonlat;
	}
	public void setLeftTopLonlat(LonLat leftTopLonlat) {
		this.leftTopLonlat = leftTopLonlat;
	}
	public LonLat getRightBottomLonLat() {
		return rightBottomLonLat;
	}
	public void setRightBottomLonLat(LonLat rightBottomLonLat) {
		this.rightBottomLonLat = rightBottomLonLat;
	}
	public LonLat getCenterLonlat() {
		return centerLonlat;
	}
	public void setCenterLonlat(LonLat centerLonlat) {
		this.centerLonlat = centerLonlat;
	}
	public LonLat getMyLeftTopLonLat() {
		return myLeftTopLonLat;
	}
	public void setMyLeftTopLonLat(LonLat myLeftTopLonLat) {
		this.myLeftTopLonLat = myLeftTopLonLat;
	}
	public LonLat getMyRightBottomLonLat() {
		return myRightBottomLonLat;
	}
	public void setMyRightBottomLonLat(LonLat myRightBottomLonLat) {
		this.myRightBottomLonLat = myRightBottomLonLat;
	}
	public int getMinLevel() {
		return minLevel;
	}
	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
}
