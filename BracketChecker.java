class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public boolean check() {
        LinkStack stack = new LinkStack();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char openingBracket = (char) stack.pop();
                        if ((ch == '}' && openingBracket != '{') || (ch == ']' && openingBracket != '[') ||
                                (ch == ')' && openingBracket != '('))
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}