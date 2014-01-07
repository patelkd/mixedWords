private String[] mixedWords (String[] words) {
	String newWord = new String [words.length()]; 
	for (int i=0; i<words.length(); i+=2) {
		word1 = words[i];
		word2 = words[i+1];
		newWord[i] = recombine(word1,word2);
		word1 = words[i+1];
		word2 = words[i];
		newWord[i+1] = recombine(word1, word2);
	}
	return newWord;
}
