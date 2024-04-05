import java.util.*;

// TreeNode sınıfı, ikili ağaç düğümlerini temsil eder.
class TreeNode {
    int val; // Düğümün değeri
    TreeNode left; // Sol alt düğüm
    TreeNode right; // Sağ alt düğüm

    // TreeNode sınıfının yapılandırıcısı
    public TreeNode(int val) {
        this.val = val;
    }

    // İkinci bir yapılandırıcı, değeri ve sol ve sağ alt düğümleri ayarlar
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution sınıfı, ikili ağaçta maksimum yol toplamını bulan algoritmayı içerir.
class Solution {
    int answer = Integer.MIN_VALUE; // Maksimum yol toplamını saklamak için değişken

    // Maksimum yol toplamını bulan yöntem
    public int maxPathSum(TreeNode root) {
        dfs(root); // Derinlik öncelikli arama (DFS) yöntemini çağır
        return answer; // Maksimum yol toplamını döndür
    }

    // DFS yöntemi, bir düğümün maksimum yol toplamını hesaplar
    private int dfs(TreeNode node) {
        if (node == null)
            return 0; // Geçersiz düğüm, 0 döndür

        // Sol alt düğümün maksimum yol toplamını hesapla
        int left = Math.max(dfs(node.left), 0);
        // Sağ alt düğümün maksimum yol toplamını hesapla
        int right = Math.max(dfs(node.right), 0);

        // Bu düğümü içeren yolun toplamını hesapla
        answer = Math.max(answer, node.val + left + right);

        // Bu düğümün, sol ve sağ alt düğümlerinden hangisiyle devam etmek daha iyidir?
        return node.val + Math.max(left, right);
    }

    // Ana yöntem, çözümü test etmek için örnek bir ağaç oluşturur ve sonucu yazdırır.
    public static void main(String[] args) {
        // Örnek ağaç oluşturma
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Çözüm sınıfı örneği oluşturma
        Solution solution = new Solution();

        // Sonucu yazdırma
        System.out.println("Maximum path sum: " + solution.maxPathSum(root));
    }
}
