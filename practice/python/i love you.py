from gtts import gTTS
from playsound import playsound
import pyttsx3

engine = pyttsx3.init('sapi5')
voices=engine.getProperty('voices')
engine.setProperty('voice', voices[1].id)
def speak(text):
    engine.say(text)
    engine.runAndWait()
text1="I LOVE YOU, Shona"
text2="I LOVE YOU, BABU"
text3="I will love you till the end of time."
for i in range (4):
    speak(text1)
    print(text1)
    speak(text2)
    print(text2)
    speak(text3)
    print(text3)
