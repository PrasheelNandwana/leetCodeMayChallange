class TrieNode
{
    public HashMap <Character,TrieNode> child= new HashMap<>();
    public boolean endOfTree= false;
    public TrieNode()
    {
        child = new HashMap();
    }
}

class Trie 
{
    TrieNode head;
    /** Initialize your data structure here. */
    public Trie() 
    {
        head= new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) 
    {
        TrieNode root= head;
        for(int i=0;i<word.length();i++)
        {
        if(root.child.containsKey(word.charAt(i)))
        {
            root=root.child.get(word.charAt(i));
        }
        else
        {
            root.child.put(word.charAt(i),new TrieNode());
            root=root.child.get(word.charAt(i));
        }
        }
        root.endOfTree=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) 
    {
        TrieNode root=head;
        for(int i=0;i<word.length();i++)
        {
            if(root.child.containsKey(word.charAt(i)))
                root=root.child.get(word.charAt(i));
            else 
                return false;
            System.out.println(root.endOfTree);
        }
        if(root.endOfTree)
            return true;
        
        return false;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) 
        {
            TrieNode root=head;
            for(int i=0;i<word.length();i++)
            {
                if(root.child.containsKey(word.charAt(i)))
                root=root.child.get(word.charAt(i));
            else 
                return false;
            }
            return true;
        }
}
