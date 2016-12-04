package com.yaohoo.service.common.util;

/**
 * Created by yaoqiang on 2016/12/4.
 */
public class APIUtils {

    public static class Paging {
        private int offset;
        private int limit;
        private int total;
        private boolean hasMore = true;

        private Paging(int offset, int limit) {
            this.offset = offset;
            this.limit = limit;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public boolean getHasMore() {
            return hasMore;
        }

        public void setHasMore(boolean hasMore) {
            this.hasMore = hasMore;
        }

    }

    public static Paging makePaging(int offset, int limit, int maxLimit) {
        offset = Math.max(0, offset);
        limit = Math.min(maxLimit, Math.max(0, limit));
        return new Paging(offset, limit);
    }

    private APIUtils() {
    }

}
