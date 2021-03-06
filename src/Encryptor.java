import java.util.Arrays;

public class Encryptor
{
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Constructor*/
    public Encryptor(int r, int c)
    {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock()
    {
        return letterBlock;
    }

    /** Places a string into letterBlock in row-major order.
     *
     *   @param str  the string to be processed
     *
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        int index = 0;
        for (int i = 0; i < numRows; i++) // rows
        {
            for (int j = 0; j < numCols; j++) // cols
            {
                if (index != str.length())
                {
                    letterBlock[i][j] = str.substring(index, index + 1);
                    index++;
                }
                else
                {
                    letterBlock[i][j] = "A";
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *
     *   Precondition: letterBlock has been filled
     *
     *   @return the encrypted string from letterBlock
     */
    public String encryptBlock()
    {
        String str = "";
        for (int i = 0; i < numCols; i++) // cols
        {
            for (int j = 0; j < numRows; j++) // rows
            {
                str += letterBlock[j][i];
            }
        }
        return str;
    }

    /** Encrypts a message.
     *
     *  @param message the string to be encrypted
     *
     *  @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        String str = "";
        int maxNumber = numCols * numRows;
        int times = 0;
        boolean keepGoing = true;

        while (keepGoing)
        {
            if ((times + 1) * maxNumber < message.length())
            {
                fillBlock(message.substring(times * maxNumber, maxNumber * (times + 1)));
                str += encryptBlock();
            }
            else
            {
                fillBlock(message.substring(times * maxNumber));
                str += encryptBlock();
                keepGoing = false;
            }
            times++;
        }
        return str;
    }

    /**  Decrypts an encrypted message. All filler 'A's that may have been
     *   added during encryption will be removed, so this assumes that the
     *   original message (BEFORE it was encrypted) did NOT end in a capital A!
     *
     *   NOTE! When you are decrypting an encrypted message,
     *         be sure that you have initialized your Encryptor object
     *         with the same row/column used to encrypted the message! (i.e.
     *         the ???encryption key??? that is necessary for successful decryption)
     *         This is outlined in the precondition below.
     *
     *   Precondition: the Encryptor object being used for decryption has been
     *                 initialized with the same number of rows and columns
     *                 as was used for the Encryptor object used for encryption.
     *
     *   @param encryptedMessage  the encrypted message to decrypt
     *
     *   @return  the decrypted, original message (which had been encrypted)
     *
     *   TIP: You are encouraged to create other helper methods as you see fit
     *        (e.g. a method to decrypt each section of the decrypted message,
     *         similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage)
    {
        String str = "";
        int maxNumber = numCols * numRows;
        int times = 0;


        while (times * maxNumber < encryptedMessage.length())
        {
            String shortMessage = "";
            if ((times + 1) * maxNumber < encryptedMessage.length())
            {
                shortMessage = encryptedMessage.substring(times * maxNumber, (times + 1) * maxNumber);
            }
            else
            {
                shortMessage = encryptedMessage.substring(times * maxNumber);
            }

            // put it into letterblock column first, then row
            int index = 0;
            for (int i = 0; i < numCols; i++) // cols
            {
                for (int j = 0; j < numRows; j++) // rows
                {
                    if (index != shortMessage.length())
                    {
                        letterBlock[j][i] = shortMessage.substring(index, index + 1);
                        index++;
                    }
                }
            }
            // put the word into str
            for (String[] rows : letterBlock)
            {
                for (String item : rows)
                {
                    str += item;
                }
            }
            times++;
        }

        while (str.substring(str.length() - 1).equals("A"))
        {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
