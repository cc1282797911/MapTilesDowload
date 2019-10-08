package map;

public class Persenter {
	
	public boolean startDownLoad(DownLoadConfig config) {
		DownLoad downLoad = new DownLoad();
		downLoad.setDownLoadConfig(config);
		downLoad.setListener(new DownLoadListener() {
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onError(String error) {
				// TODO Auto-generated method stub
				
			}
		});
		downLoad.start();
		return true;
	}

}
