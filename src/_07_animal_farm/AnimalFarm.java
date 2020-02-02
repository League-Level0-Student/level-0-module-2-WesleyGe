//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AnimalFarm {
	
	public static void main(String[] args) {
	
		/* 1. Ask the user which animal they want, then play the sound of that animal. */	
		JOptionPane.showMessageDialog(null,"Welcome to Animal Farm, (not the one by George Orwell) by Wesley Ge (Febuary 1st 2020)!");
		JOptionPane.showMessageDialog(null,"Choose between cow, dog, cat, llama, or duck.");
		for (int i=0; i<1000; i++) {
		String input = JOptionPane.showInputDialog("What animal do you want to hear?");
		if (input.equals("cow")) {
			
			playMoo();
		} else if (input.equals("duck")) {
			playQuack();
		}else if (input.equals("llama")) {
			playLlama();
		}else if (input.equals("dog")) {
			playWoof();
		}else if (input.equals("cat")) {
			playMeow();
		}
		}
	}
		/* 2. Make it so that the user can keep entering new animals. */

	

	static void playMoo() {
		playNoise(mooFile);
	}

	static void playQuack() {
		playNoise(quackFile);
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}