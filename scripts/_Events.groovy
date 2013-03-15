currentColour = "\033[32m"
resetDefault = "\033[0m"

eventTestCaseStart = { name ->
	List parts = name.tokenize('.')
	event('StatusUpdate', ["Currently running: ${currentColour}${parts.last()}${resetDefault} /"])
}

eventTestFailure = { name, failure, isError ->
	currentColour = "\033[31m"
}