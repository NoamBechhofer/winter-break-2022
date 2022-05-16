/*  Noam Bechhofer
    Fortune.java - gives you a fortune.
    Credit to Josh Madison for these fortunes.
    https://joshmadison.com/2008/04/20/fortune-cookie-fortunes/
    */
import java.util.Random;
public class Fortune{
  public static String next(){
    Random rn = new Random();
    int choice = rn.nextInt(225);
    switch (choice){
      case 0:
        return "A beautiful, smart, and loving person will be coming into your life.";
      case 1:
        return "A dubious friend may be an enemy in camouflage.";
      case 2:
        return "A faithful friend is a strong defense.";
      case 3:
        return "A feather in the hand is better than a bird in the air. ";
      case 4:
        return "A fresh start will put you on your way.";
      case 5:
        return "A friend asks only for your time not your money.";
      case 6:
        return "A friend is a present you give yourself.";
      case 7:
        return "A gambler not only will lose what he has, but also will lose what he doesn't have.";
      case 8:
        return "A golden egg of opportunity falls into your lap this month.";
      case 9:
        return "A good friendship is often more important than a passionate romance.";
      case 10:
        return "A good time to finish up old tasks. ";
      case 11:
        return "A hunch is creativity trying to tell you something.";
      case 12:
        return "A lifetime friend shall soon be made.";
      case 13:
        return "A lifetime of happiness lies ahead of you.";
      case 14:
        return "A light heart carries you through all the hard times.";
      case 15:
        return "A new perspective will come with the new year. ";
      case 16:
        return "A person is never to (sic) old to learn. ";
      case 17:
        return "A person of words and not deeds is like a garden full of weeds.";
      case 18:
        return "A pleasant surprise is waiting for you.";
      case 19:
        return "A short pencil is usually better than a long memory any day.";
      case 20:
        return "A small donation is call for. It's the right thing to do.";
      case 21:
        return "A smile is your personal welcome mat.";
      case 22:
        return "A smooth long journey! Great expectations.";
      case 23:
        return "A soft voice may be awfully persuasive.";
      case 24:
        return "A truly rich life contains love and art in abundance.";
      case 25:
        return "Accept something that you cannot change, and you will feel better.";
      case 26:
        return "Adventure can be real happiness.";
      case 27:
        return "Advice is like kissing. It costs nothing and is a pleasant thing to do. ";
      case 28:
        return "Advice, when most needed, is least heeded.";
      case 29:
        return "All the effort you are making will ultimately pay off.";
      case 30:
        return "All the troubles you have will pass away very quickly.";
      case 31:
        return "All will go well with your new project.";
      case 32:
        return "All your hard work will soon pay off.";
      case 33:
        return "Allow compassion to guide your decisions.";
      case 34:
        return "An acquaintance of the past will affect you in the near future.";
      case 35:
        return "An agreeable romance might begin to take on the appearance.";
      case 36:
        return "An important person will offer you support.";
      case 37:
        return "An inch of time is an inch of gold.";
      case 38:
        return "Any day above ground is a good day.";
      case 39:
        return "Any decision you have to make tomorrow is a good decision.";
      case 40:
        return "At the touch of love, everyone becomes a poet.";
      case 41:
        return "Be careful or you could fall for some tricks today.";
      case 42:
        return "Beauty in its various forms appeals to you. ";
      case 43:
        return "Because you demand more from yourself, others respect you deeply.";
      case 44:
        return "Believe in yourself and others will too.";
      case 45:
        return "Believe it can be done.";
      case 46:
        return "Better ask twice than lose yourself once.";
      case 47:
        return "Bide your time, for success is near.";
      case 48:
        return "Carve your name on your heart and not on marble.";
      case 49:
        return "Change is happening in your life, so go with the flow!";
      case 50:
        return "Competence like yours is underrated.";
      case 51:
        return "Congratulations! You are on your way.";
      case 52:
        return "Could I get some directions to your heart? ";
      case 53:
        return "Courtesy begins in the home.";
      case 54:
        return "Courtesy is contagious.";
      case 55:
        return "Curiosity kills boredom. Nothing can kill curiosity.";
      case 56:
        return "Dedicate yourself with a calm mind to the task at hand.";
      case 57:
        return "Depart not from the path which fate has you assigned.";
      case 58:
        return "Determination is what you need now.";
      case 59:
        return "Diligence and modesty can raise your social status.";
      case 60:
        return "Disbelief destroys the magic.";
      case 61:
        return "Distance yourself from the vain.";
      case 62:
        return "Do not be intimidated by the eloquence of others.";
      case 63:
        return "Do not demand for someone's soul if you already got his heart.";
      case 64:
        return "Do not let ambitions overshadow small success.";
      case 65:
        return "Do not make extra work for yourself.";
      case 66:
        return "Do not underestimate yourself. Human beings have unlimited potentials.";
      case 67:
        return "Do you know that the busiest person has the largest amount of time?";
      case 68:
        return "Don't be discouraged, because every wrong attempt discarded is another step forward.";
      case 69:
        return "Don't confuse recklessness with confidence. ";
      case 70:
        return "Don't just spend time. Invest it.";
      case 71:
        return "Don't just think, act!";
      case 72:
        return "Don't let friends impose on you, work calmly and silently.";
      case 73:
        return "Don't let the past and useless detail choke your existence.";
      case 74:
        return "Don't let your limitations overshadow your talents.";
      case 75:
        return "Don't worry; prosperity will knock on your door soon.";
      case 76:
        return "Each day, compel yourself to do something you would rather not do.";
      case 77:
        return "Education is the ability to meet life's situations.";
      case 78:
        return "Embrace this love relationship you have!";
      case 79:
        return "Emulate what you admire in your parents. ";
      case 80:
        return "Emulate what you respect in your friends.";
      case 81:
        return "Every flower blooms in its own sweet time.";
      case 82:
        return "Every wise man started out by asking many questions.";
      case 83:
        return "Everyday in your life is a special occasion.";
      case 84:
        return "Everywhere you choose to go, friendly faces will greet you.";
      case 85:
        return "Expect much of yourself and little of others.";
      case 86:
        return "Failure is the chance to do better next time.";
      case 87:
        return "Failure is the path of lease persistence.";
      case 88:
        return "Fear and desire ' two sides of the same coin.";
      case 89:
        return "Fearless courage is the foundation of victory.";
      case 90:
        return "Feeding a cow with roses does not get extra appreciation.";
      case 91:
        return "First think of what you want to do; then do what you have to do.";
      case 92:
        return "Follow the middle path. Neither extreme will make you happy.";
      case 93:
        return "For hate is never conquered by hate. Hate is conquered by love.";
      case 94:
        return "For the things we have to learn before we can do them, we learn by doing them.";
      case 95:
        return "Fortune Not Found: Abort, Retry, Ignore?";
      case 96:
        return "From listening comes wisdom and from speaking repentance.";
      case 97:
        return "From now on your kindness will lead you to success.";
      case 98:
        return "Get your mind set ' confidence will lead you on.";
      case 99:
        return "Get your mind set'confidence will lead you on.";
      case 100:
        return "Go for the gold today! You'll be the champion of whatever.";
      case 101:
        return "Go take a rest; you deserve it.";
      case 102:
        return "Good news will be brought to you by mail.";
      case 103:
        return "Good news will come to you by mail.";
      case 104:
        return "Good to begin well, better to end well.";
      case 105:
        return "Happiness begins with facing life with a smile and a wink.";
      case 106:
        return "Happiness will bring you good luck.";
      case 107:
        return "Happy life is just in front of you.";
      case 108:
        return "Hard words break no bones, fine words butter no parsnips.";
      case 109:
        return "Have a beautiful day.";
      case 110:
        return "He who expects no gratitude shall never be disappointed. ";
      case 111:
        return "He who knows he has enough is rich.";
      case 112:
        return "He who knows others is wise. He who knows himself is enlightened.";
      case 113:
        return "Help! I'm being held prisoner in a chinese bakery!";
      case 114:
        return "How many of you believe in psycho-kinesis? Raise my hand.";
      case 115:
        return "How you look depends on where you go.";
      case 116:
        return "I learn by going where I have to go.";
      case 117:
        return "If a true sense of value is to be yours it must come through service.";
      case 118:
        return "If certainty were truth, we would never be wrong.";
      case 119:
        return "If you continually give, you will continually have.";
      case 120:
        return "If you look in the right places, you can find some good offerings.";
      case 121:
        return "If you think you can do a thing or think you can't do a thing, you're right.";
      case 122:
        return "If you wish to see the best in others, show the best of yourself.";
      case 123:
        return "If your desires are not extravagant, they will be granted.";
      case 124:
        return "If your desires are not to extravagant they will be granted. ";
      case 125:
        return "If you're feeling down, try throwing yourself into your work.";
      case 126:
        return "Imagination rules the world.";
      case 127:
        return "In order to take, one must first give.";
      case 128:
        return "In the end all things will be known.";
      case 129:
        return "In this world of contradiction, It's better to be merry than wise.";
      case 130:
        return "It could be better, but its [sic] good enough.";
      case 131:
        return "It is better to be an optimist and proven a fool than to be a pessimist and be proven right.";
      case 132:
        return "It is better to deal with problems before they arise.";
      case 133:
        return "It is honorable to stand up for what is right, however unpopular it seems.";
      case 134:
        return "It is worth reviewing some old lessons.";
      case 135:
        return "It takes courage to admit fault.";
      case 136:
        return "It's not the amount of time you devote, but what you devote to the time that counts.";
      case 137:
        return "It's time to get moving. Your spirits will lift accordingly.";
      case 138:
        return "Keep your face to the sunshine and you will never see shadows.";
      case 139:
        return "Let the world be filled with tranquility and goodwill.";
      case 140:
        return "Like the river flow into the sea. Something are just meant to be.";
      case 141:
        return "Listen not to vain words of empty tongue.";
      case 142:
        return "Listen to everyone. Ideas come from everywhere.";
      case 143:
        return "Living with a commitment to excellence shall take you far.";
      case 144:
        return "Long life is in store for you.";
      case 145:
        return "Love is a warm fire to keep the soul warm.";
      case 146:
        return "Love is like sweet medicine, good to the last drop.";
      case 147:
        return "Love lights up the world.";
      case 148:
        return "Love truth, but pardon error. ";
      case 149:
        return "Man is born to live and not prepared to live.";
      case 150:
        return "Man's mind, once stretched by a new idea, never regains it's original dimensions.";
      case 151:
        return "Many will travel to hear you speak.";
      case 152:
        return "Meditation with an old enemy is advised.";
      case 153:
        return "Miles are covered one step at a time.";
      case 154:
        return "Nature, time and patience are the three great physicians.";
      case 155:
        return "Never fear! The end of something marks the start of something new.";
      case 156:
        return "New ideas could be profitable.";
      case 157:
        return "New people will bring you new realizations, especially about big issues. ";
      case 158:
        return "No one can walk backwards into the future.";
      case 159:
        return "Nothing is more difficult, and therefore more precious, than to be able to decide.";
      case 160:
        return "Now is a good time to buy stock.";
      case 161:
        return "Now is the time to go ahead and pursue that love interest!";
      case 162:
        return "Now is the time to try something new";
      case 163:
        return "Now is the time to try something new.";
      case 164:
        return "Observe all men, but most of all yourself.";
      case 165:
        return "One can never fill another's shoes, rather he must outgrow the old shoes.";
      case 166:
        return "One of the first things you should look for in a problem is its positive side.";
      case 167:
        return "Others can help you now.";
      case 168:
        return "Pennies from heaven find their way to your doorstep this year!";
      case 169:
        return "People are attracted by your Delicate [sic] features.";
      case 170:
        return "People find it difficult to resist your persuasive manner.";
      case 171:
        return "Perhaps you've been focusing too much on saving.";
      case 172:
        return "Physical activity will dramatically improve your outlook today.";
      case 173:
        return "Pick battles big enough to matter, small enough to win.";
      case 174:
        return "Place special emphasis on old friendship.";
      case 175:
        return "Please visit us at www.wontonfood.com";
      case 176:
        return "Po Says: Pandas like eating bamboo, but I prefer mine dipped in chocolate.";
      case 177:
        return "Practice makes perfect.";
      case 178:
        return "Protective measures will prevent costly disasters.";
      case 179:
        return "Put your mind into planning today. Look into the future.";
      case 180:
        return "Remember the birthday but never the age.";
      case 181:
        return "Remember to share good fortune as well as bad with your friends.";
      case 182:
        return "Rest has a peaceful effect on your physical and emotional health.";
      case 183:
        return "Resting well is as important as working hard.";
      case 184:
        return "Romance moves you in a new direction.";
      case 185:
        return "Savor your freedom ' it is precious.";
      case 186:
        return "Say hello to others. You will have a happier day.";
      case 187:
        return "Self-knowledge is a life long process.";
      case 188:
        return "Share your joys and sorrows with your family.";
      case 189:
        return "Sift through your past to get a better idea of the present.";
      case 190:
        return "Sloth makes all things difficult; industry all easy.";
      case 191:
        return "Small confidences mark the onset of a friendship.";
      case 192:
        return "Society prepares the crime; the criminal commits it.";
      case 193:
        return "Someone you care about seeks reconciliation.";
      case 194:
        return "Soon life will become more interesting.";
      case 195:
        return "Stand tall. Don't look down upon yourself. ";
      case 196:
        return "Staying close to home is going to be best for your morale today";
      case 197:
        return "Stop searching forever, happiness is just next to you.";
      case 198:
        return "Strong reasons make strong actions.";
      case 199:
        return "Success is a journey, not a destination.";
      case 200:
        return "Success is failure turned inside out.";
      case 201:
        return "Success is going from failure to failure without loss of enthusiasm.";
      case 202:
        return "Swimming is easy. Stay floating is hard.";
      case 203:
        return "Take care and sensitivity you show towards others will return to you.";
      case 204:
        return "Take the high road.";
      case 205:
        return "Technology is the art of arranging the world so we do not notice it.";
      case 206:
        return "The austerity you see around you covers the richness of life like a veil.";
      case 207:
        return "The best prediction of future is the past.";
      case 208:
        return "The change you started already have far-reaching effects. Be ready.";
      case 209:
        return "The change you started already have far-reaching effects. Be ready.";
      case 210:
        return "The first man gets the oyster, the second man gets the shell.";
      case 211:
        return "The greatest achievement in life is to stand up again after falling.";
      case 212:
        return "The harder you work, the luckier you get.";
      case 213:
        return "The night life is for you.";
      case 214:
        return "The one that recognizes the illusion does not act as if it is real.";
      case 215:
        return "The only people who never fail are those who never try.";
      case 216:
        return "The person who will not stand for something will fall for anything.";
      case 217:
        return "The philosophy of one century is the common sense of the next.";
      case 218:
        return "The saints are the sinners who keep on trying.";
      case 219:
        return "The secret to good friends is no secret to you. ";
      case 220:
        return "The small courtesies sweeten life, the greater ennoble it.";
      case 221:
        return "The smart thing to do is to begin trusting your intuitions.";
      case 222:
        return "The strong person understands how to withstand substantial loss.";
      case 223:
        return "The sure way to predict the future is to invent it.";
      case 224:
        return "The truly generous share, even with the undeserving.";
      default:
        return "No fortune. Apple or something like that.";
    }
  }
}
