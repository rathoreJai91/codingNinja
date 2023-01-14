package DataStructures.Tries;

import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class PatternMatching {
    
    private TrieNode root;
	public int count;
	public PatternMatching() {
		root = new TrieNode('\0');
	}

    private void addSuffixHelper(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminating=true;
            return;
        }
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;
        }
        addSuffixHelper(child, word.substring(1));
    }
    public void addSuffix(String word){
        addSuffixHelper(root,word);
    }
    private boolean searchHelper(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return searchHelper(child, word.substring(1));
	}
    public boolean search(String word){
		return searchHelper(root, word);
	}

    public boolean patternMatching(ArrayList<String> input, String pattern) {
        // Write your code here
        for(String i : input){
            String currWord=i;
            int n=currWord.length();
            for(int j=0;j<n;j++){
                addSuffixHelper(root,currWord.substring(j));
            }   
            if(searchHelper(root,pattern)){
                return true;
            }
        }
        return false;
	}
}
