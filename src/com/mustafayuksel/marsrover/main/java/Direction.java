package com.mustafayuksel.marsrover.main.java;

public enum Direction {
	N {
		@Override
		public Direction left() {
			return W;
		}

		@Override
		public Direction right() {
			return E;
		}
	},
	S {
		@Override
		public Direction left() {
			return E;
		}

		@Override
		public Direction right() {
			return W;
		}
	},
	W {
		@Override
		public Direction left() {
			return S;
		}

		@Override
		public Direction right() {
			return N;
		}
	},
	E {
		@Override
		public Direction left() {
			return N;
		}

		@Override
		public Direction right() {
			return S;
		}
	};

	abstract Direction left();

	abstract Direction right();
}