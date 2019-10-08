package map;

public class DownLoad {
	
	private DownLoadListener listener;
	
	private DownLoadConfig downLoadConfig;

	public void start() {
		new Thread(){
			public void run() {
				int currentLevel = 1;//downLoadConfig.getMinLevel();
				log("地图等级 = " + currentLevel);
				int columnNum = (int) Math.pow(2, currentLevel);
				log("列数 = " + columnNum);
				long tilesNum = (long) Math.pow(columnNum, 2);
	            log("该级别的瓦片数量 =  " + tilesNum);
	            
	            double lonLength = Math.abs(downLoadConfig.getLeftTopLonlat().lon) + Math.abs(downLoadConfig.getRightBottomLonLat().lon);
	            log("经度总长 = " + lonLength);
	            double latLength = Math.abs(downLoadConfig.getLeftTopLonlat().lat) + Math.abs(downLoadConfig.getRightBottomLonLat().lat);
	            log("纬度总长 = " + latLength);
	            
	            double tilesLon = lonLength / columnNum;
	            log("每个瓦片占用的经度 = " + tilesLon);
	            double tilesLat = latLength / columnNum;
	            log("每个瓦片占用的纬度 = " + tilesLat);
	            
	            double downloadRectTop = downLoadConfig.getLeftTopLonlat().lon - downLoadConfig.getMyLeftTopLonLat().lon;
	            log("下载区域到地图最上方的经度距离 = " + downloadRectTop);
			}
		}.start();
	}
	
	public void setListener(DownLoadListener listener) {
		this.listener = listener;
	}

	public void setDownLoadConfig(DownLoadConfig downLoadConfig) {
		this.downLoadConfig = downLoadConfig;
	}
	
	private void log(String str) {
		System.out.println(str);
	}

	private double getLength(double v1, double v2) {
		//两个都为负数
		if(v1 < 0 && v2 < 0) {
			v1 = Math.abs(v1);
			v2 = Math.abs(v2);
			return Math.abs(v1 - v2);
		}else
			//v1为负数
			if(v1 < 0 && v2 >= 0) {
				v1 = Math.abs(v1);
				return v1 + v2;
			}else
				//v2为负数
				if(v1 >= 0 && v2 < 0) {
					v2 = Math.abs(v2);
					return v1 + v2;
				}else
					//两个都为正数
					if(v1 >= 0 && v2 >= 0) {
						return Math.abs(v1 - v2);
					}
		return 0;
	}
}
