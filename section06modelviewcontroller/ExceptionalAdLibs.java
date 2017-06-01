package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb");
    String currentAdverb = MessageBox.askForTextInput("Enter a verb ending in '-ed")
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentStory = "Today";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory = currentStory + "I woke" + currentAdverb +".";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    MessageBox.showMessage(currentStory);
  }
}