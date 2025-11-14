package p1;



class SocialMediaAccount {

	String user_name;
	String user_gamil;
	boolean is_public;
	boolean is_verifed;
	String country_origin;
	int no_of_post;
	int no_of_like;
	int no_of_comments;
	
	
	
	SocialMediaAccount(){
		
		user_name="Samyak";
		 user_gamil="sonone@gamil.com";
		 is_public=true;
		 is_verifed=false;
		 country_origin="unknown";
		 no_of_post=20;
		 no_of_like=100;
		 
		 no_of_comments=25;
	}
	
	SocialMediaAccount(String user_name, String user_gamil, boolean is_public, boolean is_verifed,
			String country_origin, int no_of_post, int no_of_like, int no_of_comments) 
	{
		super();
		this.user_name = user_name;
		this.user_gamil = user_gamil;
		this.is_public = is_public;
		this.is_verifed = is_verifed;
		this.country_origin = country_origin;
		this.no_of_post = no_of_post;
		this.no_of_like = no_of_like;
		this.no_of_comments = no_of_comments;
	}

	String getUser_name() {
		return user_name;
	}

	void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	String getUser_gamil() {
		return user_gamil;
	}

	void setUser_gamil(String user_gamil) {
		this.user_gamil = user_gamil;
	}

	boolean isIs_public() {
		return is_public;
	}

	void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}

	boolean isIs_verifed() {
		return is_verifed;
	}

	void setIs_verifed(boolean is_verifed) {
		this.is_verifed = is_verifed;
	}

	String getCountry_origin() {
		return country_origin;
	}

	void setCountry_origin(String country_origin) {
		this.country_origin = country_origin;
	}

	int getNo_of_post() {
		return no_of_post;
	}

	void setNo_of_post(int no_of_post) {
		this.no_of_post = no_of_post;
	}

	int getNo_of_like() {
		return no_of_like;
	}

	void setNo_of_like(int no_of_like) {
		this.no_of_like = no_of_like;
	}

	int getNo_of_comments() {
		return no_of_comments;
	}

	void setNo_of_comments(int no_of_comments) {
		this.no_of_comments = no_of_comments;
	}
	
	void Display() {
		System.out.println("user Name : " + this.user_name);
		
		System.out.println("User Gmail :" + this.user_gamil);
		System.out.println("Account is Public :" + this.is_public);
		System.out.println("Account is Verified :" + this.is_verifed);
		System.out.println("Countr Of origin :" + this.country_origin);
		System.out.println("No Of Post :" + this.no_of_post);
		System.out.println("No Of Like :" + this.no_of_like);
		System.out.println("No Of Comments :" + this.no_of_comments);
	}
}
// SocialMediaAccount end here


class Instagram extends  SocialMediaAccount{
	 
	 int no_of_followers;
	 int no_of_highlight;
	 int no_of_post;
	 int story_archive;
	 int no_of_saved;
	 
	 
	 Instagram(){
		 super();
		 
		 no_of_followers=1000;
		no_of_highlight=25;
		no_of_post=30;
		no_of_saved=500;
		
		 
	 }
	 
Instagram(String user_name, String user_gamil, boolean is_public, boolean is_verifed,
			String country_origin, int no_of_post, int no_of_like, int no_of_comments,int no_of_followers, int no_of_highlight,  int story_archive, int no_of_saved) {
		super(user_name,user_gamil,is_public,is_verifed,country_origin,no_of_post,no_of_like,no_of_comments);
		this.no_of_followers = no_of_followers;
		this.no_of_highlight = no_of_highlight;
		this.no_of_post = no_of_post;
		this.story_archive = story_archive;
		this.no_of_saved = no_of_saved;
	 }

int getNo_of_followers() {
	return no_of_followers;
}

void setNo_of_followers(int no_of_followers) {
	this.no_of_followers = no_of_followers;
}

int getNo_of_highlight() {
	return no_of_highlight;
}

void setNo_of_highlight(int no_of_highlight) {
	this.no_of_highlight = no_of_highlight;
}

int getNo_of_post() {
	return no_of_post;
}

void setNo_of_post(int no_of_post) {
	this.no_of_post = no_of_post;
}

int getStory_archive() {
	return story_archive;
}

void setStory_archive(int story_archive) {
	this.story_archive = story_archive;
}

int getNo_of_saved() {
	return no_of_saved;
}

void setNo_of_saved(int no_of_saved) {
	this.no_of_saved = no_of_saved;
}
	 
void Display() {
	 
	 super.Display();
	 System.out.println("No Of Followers :" + this.no_of_followers);
	 System.out.println("No Of highlight :" + this.no_of_highlight);
	 System.out.println("No of post :" + this.no_of_post);
	 System.out.println("Story archive :" + this.story_archive);
	 System.out.println("No of Post saved :" + this.no_of_saved); 
}

 }
//instagram end here

class Linkdin extends SocialMediaAccount{
	 
	 int no_of_connection;
	 int no_of_profileview;
	 int no_of_jobaplied;
	 
	 
	 Linkdin(){
		 super();
		 
		 no_of_connection=1000;
		 no_of_profileview=1500;
		 no_of_jobaplied=500;
		 
		 
	 }
	 
	 
	 Linkdin(String user_name, String user_gamil, boolean is_public, boolean is_verifed,
				String country_origin, int no_of_post, int no_of_like, int no_of_comments,int no_of_connection, int no_of_profileview, int no_of_jobaplied) {
		super(user_name,user_gamil,is_public,is_verifed,country_origin,no_of_post,no_of_like,no_of_comments);
		this.no_of_connection = no_of_connection;
		this.no_of_profileview = no_of_profileview;
		this.no_of_jobaplied = no_of_jobaplied;
	 }


	 int getNo_of_connection() {
		 return no_of_connection;
	 }


	 void setNo_of_connection(int no_of_connection) {
		 this.no_of_connection = no_of_connection;
	 }


	 int getNo_of_profileview() {
		 return no_of_profileview;
	 }


	 void setNo_of_profileview(int no_of_profileview) {
		 this.no_of_profileview = no_of_profileview;
	 }


	 int getNo_of_jobaplied() {
		 return no_of_jobaplied;
	 }


	 void setNo_of_jobaplied(int no_of_jobaplied) {
		 this.no_of_jobaplied = no_of_jobaplied;
	 }
	 void Display() {
		 
		 super.Display();
		 System.out.println("No Of Connection :" + this.no_of_connection);
		 System.out.println("no Of profile view :" + this.no_of_profileview);
		 System.out.println("No Of jobapplied :" + this.no_of_jobaplied);
	 }
	 
}
// linkdein end here


class YouTube extends SocialMediaAccount{
	 int no_of_subsciber;
	 int watching_time;
	 boolean is_mentioned;
	 int no_of_shares;
	 
	 
	 YouTube(){
		 super();
		 
		 no_of_subsciber=10000;
		 watching_time=6;
		 is_mentioned=true;
		 no_of_shares=2000;
		 
		 
	 }
	 
	 
	 YouTube(String user_name, String user_gamil, boolean is_public, boolean is_verifed,
				String country_origin, int no_of_post, int no_of_like, int no_of_comments,int no_of_subsciber, int watching_time, boolean is_mentioned, int no_of_shares) {
		super(user_name,user_gamil,is_public,is_verifed,country_origin,no_of_post,no_of_like,no_of_comments);
		this.no_of_subsciber = no_of_subsciber;
		this.watching_time = watching_time;
		this.is_mentioned = is_mentioned;
		this.no_of_shares = no_of_shares;
	 }


	 int getNo_of_subsciber() {
		 return no_of_subsciber;
	 }


	 void setNo_of_subsciber(int no_of_subsciber) {
		 this.no_of_subsciber = no_of_subsciber;
	 }


	 int getWatching_time() {
		 return watching_time;
	 }


	 void setWatching_time(int watching_time) {
		 this.watching_time = watching_time;
	 }


	 boolean isIs_mentioned() {
		 return is_mentioned;
	 }


	 void setIs_mentioned(boolean is_mentioned) {
		 this.is_mentioned = is_mentioned;
	 }


	 int getNo_of_shares() {
		 return no_of_shares;
	 }


	 void setNo_of_shares(int no_of_shares) {
		 this.no_of_shares = no_of_shares;
	 }
	 
	 void Display() {
		 super.Display();
		 System.out.println("No Of subsciber: " + this.no_of_subsciber);
		 System.out.println("Watchtime :" + this.watching_time);
		 System.out.println("Mentioned :" + this.is_mentioned);
			 
	 }
}
// Youtube end here

class Test5{
	 
	 
	 public static void main(String[] args) {
		 SocialMediaAccount s1=new SocialMediaAccount();
		 s1.Display();
		 System.out.println("\n");
		 Instagram I1=new Instagram("Sammruddhi","sammu@gamil.com",true,false,"india",4,500,100,292,15,20,100);
		 I1.Display();
		 
	}
}
