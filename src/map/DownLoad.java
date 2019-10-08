package map;

public class DownLoad {
	
	private DownLoadListener listener;
	
	private DownLoadConfig downLoadConfig;

	public void start() {
		new Thread(){
			public void run() {
				int currentLevel = 1;//downLoadConfig.getMinLevel();
				log("��ͼ�ȼ� = " + currentLevel);
				int columnNum = (int) Math.pow(2, currentLevel);
				log("���� = " + columnNum);
				long tilesNum = (long) Math.pow(columnNum, 2);
	            log("�ü������Ƭ���� =  " + tilesNum);
	            
	            double lonLength = Math.abs(downLoadConfig.getLeftTopLonlat().lon) + Math.abs(downLoadConfig.getRightBottomLonLat().lon);
	            log("�����ܳ� = " + lonLength);
	            double latLength = Math.abs(downLoadConfig.getLeftTopLonlat().lat) + Math.abs(downLoadConfig.getRightBottomLonLat().lat);
	            log("γ���ܳ� = " + latLength);
	            
	            double tilesLon = lonLength / columnNum;
	            log("ÿ����Ƭռ�õľ��� = " + tilesLon);
	            double tilesLat = latLength / columnNum;
	            log("ÿ����Ƭռ�õ�γ�� = " + tilesLat);
	            
	            double downloadRectTop = downLoadConfig.getLeftTopLonlat().lon - downLoadConfig.getMyLeftTopLonLat().lon;
	            log("�������򵽵�ͼ���Ϸ��ľ��Ⱦ��� = " + downloadRectTop);
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
		//������Ϊ����
		if(v1 < 0 && v2 < 0) {
			v1 = Math.abs(v1);
			v2 = Math.abs(v2);
			return Math.abs(v1 - v2);
		}else
			//v1Ϊ����
			if(v1 < 0 && v2 >= 0) {
				v1 = Math.abs(v1);
				return v1 + v2;
			}else
				//v2Ϊ����
				if(v1 >= 0 && v2 < 0) {
					v2 = Math.abs(v2);
					return v1 + v2;
				}else
					//������Ϊ����
					if(v1 >= 0 && v2 >= 0) {
						return Math.abs(v1 - v2);
					}
		return 0;
	}
}
