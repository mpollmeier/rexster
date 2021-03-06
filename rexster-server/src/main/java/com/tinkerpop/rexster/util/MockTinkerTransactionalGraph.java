package com.tinkerpop.rexster.util;

import com.tinkerpop.blueprints.TransactionalGraph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

/**
 * Mocked transactional graph for testing purposes.
 * <p/>
 * This class doesn't really do anything Transactional.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class MockTinkerTransactionalGraph extends TinkerGraph implements TransactionalGraph {

    private int maxBufferSize = 1;

    public MockTinkerTransactionalGraph(final String directory) {
        super(directory);
    }

    public MockTinkerTransactionalGraph() {
        super();
    }

    public void startTransaction() {

    }

    public void stopTransaction(final Conclusion conclusion) {

    }

    public void setMaxBufferSize(final int maxBufferSize) {
        this.maxBufferSize = maxBufferSize;
    }

    public int getCurrentBufferSize() {
        return 1;
    }

    public int getMaxBufferSize() {
        return maxBufferSize;
    }
}
