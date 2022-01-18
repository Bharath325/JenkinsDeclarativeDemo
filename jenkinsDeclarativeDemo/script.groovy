node{
	for(int i=0; i<2; i++) {
		stage 'Stage No.'+i
		print 'Hello, world !'
		if(i==0)
		{
			git "https://github.com/Bharath325/ForJeninks"
			echo "Running on Stage No.0"
		}
		else {
		build 'DeclaritiveDemo'
		echo'Running on Stage No.1'
		}
	}
}