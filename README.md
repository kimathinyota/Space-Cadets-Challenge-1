# Space-Cadets-Challenge-1
Write a program which converts an email ID into a name by:
   1) Constructing a BufferedReader object so that can read an email id from System.in (you will need some intermediate objects to help you here. Look it up!)
   2) Constructing the full Web page address by string concatenation
   3) Constructing a URL object from the Web address
   4) Constructing a BufferedReader object that can read from the URL (you will need some intermediate objects to help you here. Look in the    book!)
   5) Ignoring the first lines of input from the Web page and saving the one which contains the name
   6) Use the substring() method to make a temporary string which starts with the appropriate character 
   7) Use the indexOf() method to find where the '<' character appears in that string
   8) Use the substring() method again to select the 0th character through to the end of the name
   9) Print out the result
