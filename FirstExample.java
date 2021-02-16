public class FirstExample {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("\nA: "+a);
        System.out.println("B: "+b);

        //Swap the values 

        int aux = 0;    // aux?
        aux = a;
        a = b;
        b = aux;

        System.out.println("\nA: "+a);    // 20
        System.out.println("B: "+b);    // 10
    }
}
//#region
/* 
Git - useful commands (locally):
git init
git status
git add .
git commit
git log

Git - useful commands (remotely):
git remote add origin #LINK TO YOUR REPOSITORY# (first time)
git push -u origin master (first time)
git push
git pull
git fetch

Extra linux commands:
pwd - print working directory
ls - list
lart (ls -lart)
git commit -m "First commit" //-m = message
git commit -am // -am = ? eller var det -im?
git ignore
*/
//#endregion