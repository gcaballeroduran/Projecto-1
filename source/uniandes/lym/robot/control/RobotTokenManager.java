/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashMap;

/** Token Manager. */
public class RobotTokenManager implements RobotConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xdf7c0L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 0;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0xdf7c0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
            return 12;
         }
         return -1;
      case 2:
         if ((active0 & 0x100L) != 0L)
            return 12;
         if ((active0 & 0xdf6c0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
            return 12;
         }
         return -1;
      case 3:
         if ((active0 & 0x1e240L) != 0L)
            return 12;
         if ((active0 & 0xc1480L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 17;
               jjmatchedPos = 3;
            }
            return 12;
         }
         return -1;
      case 4:
         if ((active0 & 0xd9480L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
            return 12;
         }
         return -1;
      case 5:
         if ((active0 & 0x1000L) != 0L)
            return 12;
         if ((active0 & 0x58080L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
            return 12;
         }
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 17;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x8000L) != 0L)
            return 12;
         if ((active0 & 0x50080L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 6;
            return 12;
         }
         if ((active0 & 0x400L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 17;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x50080L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 7;
            return 12;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         {
         jjmatchedKind = 1;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 40:
         return jjStopAtPos(0, 22);
      case 41:
         return jjStopAtPos(0, 23);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x18040L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x300L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2080L);
      default :
         return jjMoveNfa_0(9, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 44:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x44000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x18440L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2180L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4200L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x2080L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 84:
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 12);
         break;
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x18040L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x18000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 75:
      case 107:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 12);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 83:
      case 115:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 12);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8080L);
      case 78:
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 82:
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(6, 10);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0x80L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000L);
      case 83:
      case 115:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 82:
      case 114:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(8, 16, 12);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(8, 7, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 20;
                  jjCheckNAdd(10);
                  break;
               case 0:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 4:
                  if (curChar == 44)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 5:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(12);
                  }
                  if ((0x40000000400000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 6:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 7:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\50", "\51", "\40\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1dfffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[13];
private final int[] jjstateSet = new int[26];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public RobotTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RobotTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 17;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

int[] jjemptyLineNo = new int[1];
int[] jjemptyColNo = new int[1];
boolean[] jjbeenHere = new boolean[1];
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
