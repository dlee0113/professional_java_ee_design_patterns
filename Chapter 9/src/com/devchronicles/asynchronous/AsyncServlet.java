package com.devchronicles.asynchronous;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = { "/async" }, asyncSupported = true)
public class AsyncServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		final AsyncContext asyncContext = req.startAsync();
		final String data = null;
		asyncContext.addListener(new AsyncListener() {
			@Override
			public void onComplete(AsyncEvent event) throws IOException {
				AsyncContext asyncContext = event.getAsyncContext();
				asyncContext.getResponse().getWriter().println(data);
			}

			@Override
			public void onTimeout(AsyncEvent event) throws IOException {
				// Code not shown for brevity
			}

			@Override
			public void onError(AsyncEvent event) throws IOException {
				// Code not shown for brevity
			}

			@Override
			public void onStartAsync(AsyncEvent event) throws IOException {
				// Code not shown for brevity
			}
		});
		new Thread() {
			@Override
			public void run() {
				asyncContext.complete();
			}
		}.start();
		res.getWriter().write("Results:");
		// Read data from database
		// Queried data�
		// sleep thread for some time�
	}
}