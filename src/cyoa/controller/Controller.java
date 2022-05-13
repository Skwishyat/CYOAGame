package cyoa.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import cyoa.view.StoryFrame;

/**
 * The controller for the choose your own adventure game
 * @author awil7254
 *
 */
public class Controller
{
	private StoryFrame frame;
	
	/**
	 * creates a new controller for the choose your own adventure game
	 */
	public Controller()
	{
		frame = new StoryFrame(this);
	}
	
	/**
	 * starts running the application
	 */
	public void start()
	{
		load("story types.txt", "number of stories.txt");
	}
	
	public StoryFrame getFrame()
	{
		return frame;
	}
	
	public void addGraph(String storyType)
	{
		getFrame().getPastStories().addGraph(storyType);
	}
	
	public void save(String storyFile, String numFile, ArrayList<String> storyTypes, int numStories)
	{
		File saveStoryFile = new File(storyFile);
		File saveNumFile = new File(numFile);
		
		try (PrintWriter saveStories = new PrintWriter(saveStoryFile))
		{
			for (String content : storyTypes)
			{
				saveStories.println(content);
			}
		}
		catch (IOException errorFromIO)
		{
			System.out.println("There was an io error");
		}
		catch (Exception genericError)
		{
			System.out.println("There was a generic error");
		}
		
		try (PrintWriter saveNum = new PrintWriter(saveNumFile))
		{
			saveNum.println(numStories);
		}
		catch (IOException errorFromIO)
		{
			System.out.println("There was an io error");
		}
		catch (Exception genericError)
		{
			System.out.println("There was a generic error");
		}
	}
	
	public void load(String storyFile, String numFile)
	{
		ArrayList<String> storyFileContents = new ArrayList<String>();
		
		File source = new File(storyFile);
		
		try (Scanner fileScanner = new Scanner(source))
		{
			while(fileScanner.hasNextLine())
			{
				storyFileContents.add(fileScanner.nextLine());
			}
		}
		catch (IOException fileErro)
		{
			System.out.println("there was a file error");
		}
		catch (Exception error)
		{
			System.out.println("there was a gerneric error");
		}
		
		int numFileContents = 0;
		File numSource = new File(numFile);
		
		try (Scanner fileScanner = new Scanner(numSource))
		{
			while (fileScanner.hasNextInt())
			{
				numFileContents += fileScanner.nextInt();
			}
		}
		catch (IOException fileError) 
		{
			System.out.println("there was a file error");
		}
		catch (Exception error)
		{
			System.out.println("There was a generic error");
		}
		
		for (int index = 0; index < numFileContents; index ++)
		{
			getFrame().getPastStories().addGraph(storyFileContents.get(index));
		}
		
	}
}
