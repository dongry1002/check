class Phone { 
	   String name; 
	   String address; 
	   String phoneNumber; 
	   public Phone(String name, String address, String phoneNumber) { 
	      this.name = name; 
	      this.address = address; 
	      this.phoneNumber = phoneNumber; 
	   } 
	   public String toString() { 
	      StringBuffer buff = new StringBuffer(); 
	      buff.append(name).append(" ").append(address).append(" ").append(phoneNumber); 
	      return buff.toString(); 
	   } 
	} 