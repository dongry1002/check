
	import java.util.HashMap; 
	import java.util.Scanner; 
	
	public class PhoneBookApp { 
	   HashMap<String, Phone> map = new HashMap<String, Phone>(); 
	   Scanner sc = new Scanner(System.in); 
	   private int printMenu() { 
	      System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4>> "); 
	      return Integer.parseInt( sc.nextLine() ); 
	   } 
	   private void add() { 
	      System.out.print("이름>>"); 
	      String name = sc.nextLine(); 
	      if( map.containsKey(name) ) { 
	         System.out.println(name + "는(은) 등록된 사람입니다."); 
	         return; 
	      } 
	      System.out.print("주소>>"); 
	      String address = sc.nextLine(); 
	      System.out.print("전화번호>>"); 
	      String phoneNumber = sc.nextLine(); 
	      map.put(name, new Phone(name, address, phoneNumber)); 
	   } 
	   private void del() { 
	      System.out.print("이름>>"); 
	      String name = sc.nextLine(); 
	      if( !map.containsKey(name) ) { 
	         System.out.println(name + "는(은) 등록되지 않은 사람입니다."); 
	         return ; 
	      } 
	      map.remove( name ); 
	      System.out.println(name + "는(은) 삭제되었습니다."); 
	   } 
	   private void search() { 
	      System.out.print("이름>>"); 
	      String name = sc.nextLine(); 
	      if( !map.containsKey(name) ) { 
	         System.out.println(name + "는(은) 등록되지 않은 사람입니다."); 
	         return ; 
	      } 
	      System.out.println( map.get(name) ); 
	   } 
	   private void print() { 
	      for(String key : map.keySet() ) { 
	         System.out.println( map.get(key) ); 
	      } 
	   } 
	   public static void main(String[] args) { 
	      PhoneBookApp pba = new PhoneBookApp(); 
	      while( true ) { 
	         int choice = pba.printMenu(); 
	         if( choice == 4 ) { 
	            break; 
	            } else if( choice == 0 ) { 
	            pba.add(); 
	            } else if( choice == 1 ) { 
	            pba.del(); 
	            } else if( choice == 2 ) { 
	            pba.search(); 
	            } else if( choice == 3 ) { 
	            pba.print(); 
	         } 
	      } 
	      System.out.println("프로그램을 종료합니다..."); 
	   } 
	} 


