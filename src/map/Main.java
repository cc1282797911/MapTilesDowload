package map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//地图左上角经纬度
		LonLat leftTopLonlat = new LonLat(
				85,
				-180
		);
		//地图右上角经纬度
		LonLat rightBottomLonLat = new LonLat(
				-85,
				180
		);
		//地图中心经纬度
		LonLat centerLonLat = new LonLat(
				0,
				0
		);
		//指定区域的地图左上角经纬度
		LonLat myLeftTopLonLat = new LonLat(
				85,
				0
		);
		//指定区域的地图右下角经纬度
		LonLat myRightBottomLonLat = new LonLat(
				0,
				-10
		);
		
		DownLoadConfig config = new DownLoadConfig();
		config.setLeftTopLonlat(leftTopLonlat);
		config.setRightBottomLonLat(rightBottomLonLat);
		config.setCenterLonlat(centerLonLat);
		config.setMyLeftTopLonLat(myLeftTopLonLat);
		config.setMyRightBottomLonLat(myRightBottomLonLat);
		config.setMinLevel(1);
		config.setMaxLevel(18);
		
		Persenter persenter = new Persenter();
		persenter.startDownLoad(config);
		
/*		double myWidth = getLength(myRightBottomLonLat.lon, myLeftTopLonLat.lon);
		double myHeight = getLength(leftTopLonlat.lat, rightBottomLonLat.lat);
		
		//
		double mapWidth = rightBottomLonLat.lon - leftTopLonlat.lon;
		double mapHeight = leftTopLonlat.lat - rightBottomLonLat.lat;
		System.out.println("地图高度 = " + mapHeight + "， 地图宽度 = " + mapWidth);
		for(int z = minLevel; z <= maxLevel; z++){
            //列数、行数
			int maxValue = (int) Math.pow(2, z) - 1;
			long num = 0;
            for(int x = 0 ; x <= maxValue ; x++ ){
                for(int y = 0 ; y <= maxValue ; y++ ){
                	num ++;
                }
            }
            //边长
            int sideLength = ((int) Math.sqrt(num)) * 256;
            //每1经纬度表示的边长 
            double widthWeight = sideLength / mapWidth;
            System.out.println("地图缩放级别 = " + z + "，数量 = " + num);
        }*/
		
	}
	
	static double getLength(double v1, double v2) {
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
