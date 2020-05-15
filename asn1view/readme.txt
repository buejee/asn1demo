Asn1View:
	a free tool to view asn1-decode file,or base64 decoded.
	this current is a beta version.
	


author:
	i,liukang,a programmer of china,to develope pki system and pmi.	
	my email is liukang@ncs-cyber.com.cn.

	
	please info if you find any bugs of it.



changed list:
	2003-9-10
		this first virsion of it.
	2003-12-08
		1.fix display bug when open second file.
		2.add support base64 code file(ms format)
		3.add context menu at left-tree-view.
		4.can new window,close file,refresh file.
	2004-2-25
		1.add rigth context menu to view asn1 file.
		2.use the new HexView class faster than older.
		3.support copy 
	15:49 2004-3-9
		1.changed ui, replace some icons.
		2.add F5 key to refresh data.
		3.fix some bug.
		4.write a simple help.
		
howto:
	this tool to dump asn1 encode file. It's simple to use. 
	
	menu :
		file:
			new window  	:: create a new asn1view window
			open asn1 file 	:: open a asn1 encode file
			close asn1 file :: close current file.
			refresh file	:: refresh file content.
			exit		:: exit asn1view tool
				
		view:
			toolbar		::
			statue bar
		tool:
			calculator	:: call calculator
			register context menu :: register explorer context menu item 
							the text is 'asn1view'. 
						should restart explorer.
			unregister context menu :: unregister explorer context menu.
						should restart explorer.
			