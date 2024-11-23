package shuoga5;

public enum productStatus {
    IN_STOCK{
        @Override
        protected boolean isAvailable() {
            return true;
        }
    },
    OUT_OF_STOCK{
        @Override
        protected boolean isAvailable() {
            return false;
        }
    },
    DISCONTINUED{
        @Override
        protected boolean isAvailable() {
            return false;
        }
    };

    protected abstract boolean isAvailable();
}
