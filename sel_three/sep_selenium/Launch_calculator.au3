

   ; Run Notepad
    ;Run("calc.exe")

	$windowHandle = WinGetHandle("Calculator")

	WinActivate($windowHandle)

	ControlClick("Calculator","","[CLASS:Button;INSTANCE:10]")