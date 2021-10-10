import java.util.*
import javax.print.attribute.IntegerSyntax

private var board=Board(0)
private val player1="x"
private val player2="o"
private var currectPlayer=""
private var answer=""
fun main(){
    println("Add size of the board")
    val scanner = Scanner(System.`in`)
    val size=Integer.parseInt(scanner.nextLine())
    board=Board(size )
        //board.placePiece(0,0,"X")
    board.printBoard()

    while(!board.isGameOver){
        takeTurns()
        println("$currectPlayer's turn")
        println("Enter row number: ")
        var row =Integer.parseInt(scanner.nextLine())
        println("Enter column number: ")
        var column =Integer.parseInt(scanner.nextLine())
        board.placePiece(row-1,column-1,currectPlayer)

        if(board.isGameOver){
            println("Want another game? type y")
            var answer=scanner.nextLine()
            if(isPlayingAgain(answer))
                board.resetGame()
        }

    }
}

fun takeTurns(){
    currectPlayer=if(player1==currectPlayer){
        player2
    }else
    {
        player1
    }


}

fun  isPlayingAgain(answer:String):Boolean{
    return (answer.equals("y",ignoreCase = true))
}

