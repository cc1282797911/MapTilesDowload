package map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ͼ���ϽǾ�γ��
		LonLat leftTopLonlat = new LonLat(
				85,
				-180
		);
		//��ͼ���ϽǾ�γ��
		LonLat rightBottomLonLat = new LonLat(
				-85,
				180
		);
		//��ͼ���ľ�γ��
		LonLat centerLonLat = new LonLat(
				0,
				0
		);
		//ָ������ĵ�ͼ���ϽǾ�γ��
		LonLat myLeftTopLonLat = new LonLat(
				85,
				0
		);
		//ָ������ĵ�ͼ���½Ǿ�γ��
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
		System.out.println("��ͼ�߶� = " + mapHeight + "�� ��ͼ��� = " + mapWidth);
		for(int z = minLevel; z <= maxLevel; z++){
            //����������
			int maxValue = (int) Math.pow(2, z) - 1;
			long num = 0;
            for(int x = 0 ; x <= maxValue ; x++ ){
                for(int y = 0 ; y <= maxValue ; y++ ){
                	num ++;
                }
            }
            //�߳�
            int sideLength = ((int) Math.sqrt(num)) * 256;
            //ÿ1��γ�ȱ�ʾ�ı߳� 
            double widthWeight = sideLength / mapWidth;
            System.out.println("��ͼ���ż��� = " + z + "������ = " + num);
        }*/
		
	}
	
	static double getLength(double v1, double v2) {
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
