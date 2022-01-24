package UAS.StrukturDataBinaryTree;

public class BinaryTree
{
    public void insert( TreeNode node, int nilai )
    {
        if( nilai < node.nilai ) {
            if( node.kiri != null ) {
                insert( node.kiri, nilai );
            } else {
                System.out.println( "  Nilai " + nilai + " ke kiri dari node " + node.nilai );
                node.kiri = new TreeNode(nilai);
            }
        } else if( nilai > node.nilai ) {
            if( node.kanan != null ) {
                insert( node.kanan, nilai );
            } else {
                System.out.println( "  Nilai " + nilai + " ke kanan dari node " + node.nilai );
                node.kanan = new TreeNode( nilai );
            }
        }
    }

    public void run() {
        TreeNode rootnode = new TreeNode(25);

        /* Build tree */
        System.out.println("=================================");
        System.out.println("Membangun tree dengan nilai akar " + rootnode.nilai);
        System.out.println("=================================");
        insert(rootnode, 11);
        insert(rootnode, 15);
        insert(rootnode, 16);
        insert(rootnode, 23);
        insert(rootnode, 79);

        /* Print tree in order */
        System.out.println("=================================");
        System.out.println("Mengurutkan tree Secara Berurutan");
        System.out.println("=================================");
        printInOrder(rootnode);

        /* Search tree */
        System.out.println("=================================");
        System.out.println("Search Tree");
        System.out.println("=================================");
        System.out.println("Mencari nilai 40 : ");
        search( rootnode, 40 );
        System.out.println("Mencari Nilai 11 : ");
        search( rootnode, 11 );
    }

    public void printInOrder( TreeNode node )
    {
        if( node != null ) {
            printInOrder( node.kiri );
            System.out.println( "  Nilai " + node.nilai );
            printInOrder( node.kanan );
        }
    }

    public void search( TreeNode node, int nilai )
    {
        if( node == null )
            System.out.println( " Tidak dapat mencari nilai " + nilai + " di tree." );
        else if( nilai < node.nilai )
            search( node.kiri, nilai );
        else if( nilai > node.nilai )
            search( node.kanan, nilai );
        else
            System.out.println( "  Menemukan nilai " + nilai + " di tree." );
    }


}