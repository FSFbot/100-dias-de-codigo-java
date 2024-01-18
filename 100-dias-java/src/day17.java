public class day17 {
    public static void main(String[] args) {
        System.out.println(freedPrisoners(new int[]{1, 1, 0, 0, 0, 1, 0}));
        System.out.println(freedPrisoners(new int[]{1, 1, 1}));
        System.out.println(freedPrisoners(new int[]{0, 0, 0}));
        System.out.println(freedPrisoners(new int[]{0, 1, 1, 1}));
    }

    public static int freedPrisoners(int[] cells) {
        if(cells[0] == 0) return 0; // if the first cell is locked, no one can be freed
        int freedPrisoners = 1; // otherwise, 1 prisoner is already freed (the one in the first cell)
        boolean unlocked = true;
        for(int i = 1; i < cells.length; i++) {
            if((unlocked && cells[i] == 0) || (!unlocked && cells[i] == 1)) { // if a prisoner can be freed
                freedPrisoners++;
                unlocked = !unlocked; // toggle the status of the cells
            }
        }
        return freedPrisoners;
    }
}