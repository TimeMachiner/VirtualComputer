package gate_circuit;

/**
 * 类名：或门
 * 作用：实现或门的所有逻辑
 */
public class GateOr implements Gate {

    /* 或门的输入端的值 */
    private byte[] inputs;

    /* 或门的输出端的值： output */
    private byte output;

    /**
     * 默认无参的构造方法：构造缺省的或门对象
     * 实现：
     * 1. 或门的两个输入端都赋值为0
     * 2. 输出端的值由 createOutput 生成
     */
    public GateOr() {
        this.inputs = new byte[2];
        setInputValues(this.inputs);
    }

    /**
     * 含参的构造方法：使用输入端的值构造或门对象
     * @param inputs 输入端的值
     */
    public GateOr(byte[] inputs) {
        setInputValues(inputs);
    }

    /**
     * 方法名：创建输出端的值
     * 作用：创建 <b>或门</b> 输出端的值
     * @return 新的输出值
     */
    public byte createOutput() {
        byte out = 0;
        for (byte input: this.inputs) {
            if (1 == input) {
                out = 1;
                break;
            }
        }
        return this.output = out;
    }

    /**
     * 方法名：设置输入端的值
     * 作用：设置 <b>或门</b> 输入端的值
     * @param inputs 输入端的值
     */
    public void setInputValues(byte[] inputs) {
        this.inputs = inputs;
        createOutput();
    }

    /**
     * 方法名：获取输入端的值
     * 作用：获取 <b>或门</b> 输入端的值
     * @return
     */
    @Override
    public byte[] getInputValues() {
        return this.inputs;
    }

    /**
     * 方法名：获取输出端的值
     * 作用：获取 <b>或门</b> 输出端的值
     * @return
     */
    @Override
    public byte getOutputValue() {
        return this.output;
    }
}