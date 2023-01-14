package DataStructures.Tries;

import java.util.ArrayList;

class TrieNode {
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
public class PalindromePairs {

    private TrieNode root;
	public int count;

	public PalindromePairs() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

    private String createWord(TrieNode root , String word){
        if (root == null) {
			return "";
		}
		
		if (root.isTerminating) {
			return word;
		}
		String complete="";
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			complete=createWord(child, fwd);
		}
        return complete;
    }

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			if(root.isTerminating){
                return true;
            }

            String remaining= createWord(root , "");
            if(palindromeWord(remaining))return true;

            return false;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			if(palindromeWord(word))return true;

            return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}

    private boolean palindromeWord(String word){
        if(word.length()==1){
            return true;
        }
        int i = 0,j = word.length();
        while(i<=j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    private String reverse(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return rev;
    }

    public boolean isPalindromePair(ArrayList<String> words) {
		//Your code goes here
        for(String s : words){
            if(palindromeWord(s)){
                return true;
            }
            add(reverse(s));
        }
        for(String s : words){
            if(search(s)){
                return true;
            }
        }
        return false;
	}

	public void autoComplete(ArrayList<String> input, String word) {

        // Write your code here
        for(String s : input){
            add(s);
        }
        autoCompleteSearch(root, word ,word);
    }
	private void autoCompleteSearch(TrieNode root,String word , String original){
		if(word.length()==0){
			print(root, original);
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return;
		}
		autoCompleteSearch(child, word.substring(1), original);
	}
}
