/* Generated By:JavaCC: Do not edit this line. AINLTokenManager.java */
package my.newLang;

/** Token Manager. */
public class AINLTokenManager implements AINLConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x860000000L) != 0L)
         {
            jjmatchedKind = 38;
            return 32;
         }
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 38;
            return 29;
         }
         if ((active0 & 0x80200180L) != 0L)
         {
            jjmatchedKind = 5;
            return -1;
         }
         if ((active0 & 0x600L) != 0L)
         {
            jjmatchedKind = 6;
            return -1;
         }
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 14;
            return 34;
         }
         return -1;
      case 1:
         if ((active0 & 0x80200180L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x860080000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
            return 32;
         }
         if ((active0 & 0x600L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 6;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x80000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x840000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
            return 32;
         }
         if ((active0 & 0x20080000L) != 0L)
            return 32;
         return -1;
      case 3:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
            return 32;
         }
         if ((active0 & 0x40000000L) != 0L)
            return 32;
         return -1;
      case 4:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
            return 32;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 27);
      case 34:
         return jjStopAtPos(0, 22);
      case 37:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 38:
         return jjStopAtPos(0, 28);
      case 40:
         return jjStopAtPos(0, 17);
      case 41:
         return jjStopAtPos(0, 18);
      case 42:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 43:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 44:
         return jjStopAtPos(0, 36);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x80200100L);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 58:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 63:
         jjmatchedKind = 25;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 64:
         return jjStopAtPos(0, 33);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 94:
         return jjStopAtPos(0, 11);
      case 95:
         return jjStopAtPos(0, 37);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 61:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         else if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         else if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 62:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 63:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800080000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 62:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(2, 31);
         break;
      case 68:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 32);
         break;
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 32);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 99:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 32);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(5, 35, 32);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 35;
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
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if ((0x840000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  else if ((0x280000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  if (curChar == 60)
                     jjCheckNAddTwoStates(3, 34);
                  else if (curChar == 62)
                     jjCheckNAdd(3);
                  break;
               case 34:
                  if (curChar == 62)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  break;
               case 29:
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(32);
                  break;
               case 1:
                  if ((0x840000000000L & l) != 0L)
                     kind = 6;
                  break;
               case 2:
                  if ((0x7000000000000000L & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 3:
                  if (curChar == 61 && kind > 14)
                     kind = 14;
                  break;
               case 4:
                  if (curChar == 62)
                     jjCheckNAdd(3);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if (curChar == 46)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 14:
                  if ((0x280000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 33:
                  if (curChar == 60)
                     jjCheckNAddTwoStates(3, 34);
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(32);
                  }
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 23;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 29:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(32);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 5:
                  if (curChar == 100 && kind > 15)
                     kind = 15;
                  break;
               case 6:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 114 && kind > 15)
                     kind = 15;
                  break;
               case 9:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 13:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 116 && kind > 20)
                     kind = 20;
                  break;
               case 17:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 103 && kind > 20)
                     kind = 20;
                  break;
               case 20:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 101 && kind > 20)
                     kind = 20;
                  break;
               case 26:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 30:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(32);
                  break;
               case 32:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(32);
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
      if ((i = jjnewStateCnt) == (startsAt = 35 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   10, 11, 13, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\53\75", "\55\75", "\52\75", 
"\57\75", "\136", "\45", "\45\75", null, null, null, "\50", "\51", "\144\145\146", null, 
"\55\76", "\42", "\74\55", "\72\75", "\77", "\77\77", "\41", "\46", "\105\116\104", 
"\146\165\156\143", "\55\55\76", "\73", "\100", "\72", "\162\145\164\165\162\156", "\54", "\137", 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[35];
static private final int[] jjstateSet = new int[70];
static protected char curChar;
/** Constructor. */
public AINLTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public AINLTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 35; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
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

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
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

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
