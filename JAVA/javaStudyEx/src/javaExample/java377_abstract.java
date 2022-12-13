package javaExample;

public class java377_abstract {

	public static void main(String[] args) {
		
	}

}

abstract class Player{
	boolean pause;
	int currentPost;
	
	Player() {
		pause = false;
		currentPost = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPost);
	}
	
	void pause() {
		if(pause) {
			pause = false;
			play(currentPost);
		} else {
			pause = true;
			stop();
		}
	}
	
}

class CDPlayer extends Player{
	int currentTrack;
	
	void nextTrack() {
		currentTrack++;
	}
	void preTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}
	}
	
	@Override
	void play(int correntPos) {
		
	}

	@Override
	void stop() {
		
	}
	
}
