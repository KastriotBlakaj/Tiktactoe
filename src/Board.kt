class Board(private val n :Int){
    private val empty="___"
    private  var moveCount=0
    private var isGameOver=false
    var board = Array(n){Array(n){empty} }

    fun reserBoard(){
        var board = Array(n){Array(n){empty} }
    }

    fun printBoard(){
        board.forEach{row ->
            row.forEach{element ->
                print("|$element|")
            }
            println()
        }
        println()
    }
}