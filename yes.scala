object Yes extends App {
		val yes = if (args.length > 0) args.mkString(" ") else "y"
		while (true) println(yes)
}
